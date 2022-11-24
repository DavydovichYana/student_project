package edu.javacourse.studentorder.dao;

import config.Config;
import edu.javacourse.studentorder.domain.Adress;
import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.domain.StudentOrderStatus;
import edu.javacourse.studentorder.exception.DaoException;

import java.sql.*;
import java.time.LocalDateTime;

public class StudentOrderDaoImpl implements StudentOrderDao{

    private static final String INSERT_ORDER = "INSERT INTO jc_student_order(" +
            "student_order_status, student_order_date, h_sur_name, h_given_name, h_patronymic, h_date_of_birth, h_passport_seria, h_passport_number, h_passport_date, h_passport_office_id, h_post_index, h_street_code, h_building, h_extension, h_apartment, w_sur_name, w_given_name, w_patronymic, w_date_of_birth, w_passport_seria, w_passport_number, w_passport_date, w_passport_office_id, w_post_index, w_street_code, w_building, w_extension, w_apartment, certificate_id, register_office_id, marriage_date)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    // TODO refactoring - make one method
    private Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                Config.getProperty(Config.DB_URL),
                Config.getProperty(Config.DB_LOGIN),
                Config.getProperty(Config.DB_PASSWORD));
        return con;
    }

    @Override
    public Long saveStudentOrder(StudentOrder so) throws DaoException {
        Long result = -1L;

        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(INSERT_ORDER, new String[]{"student_order_id"})) {

            // Header
            stmt.setInt(1, StudentOrderStatus.START.ordinal());
            stmt.setTimestamp(2, java.sql.Timestamp.valueOf(LocalDateTime.now()));

            // Husband
            setParamsForAdult(stmt, 3, so.getHusband());
            setParamsForAdult(stmt, 3, so.getWife());

            // Wife
            Adult wife = so.getWife();
            stmt.setString(16, wife.getSurName());
            stmt.setString(17, wife.getGivenName());
            stmt.setString(18, wife.getPatronymic());
            stmt.setDate(19, java.sql.Date.valueOf(wife.getDateOfBirth()));
            stmt.setString(20, wife.getPassportSeria());
            stmt.setString(21, wife.getPassportNumber());
            stmt.setDate(22, java.sql.Date.valueOf(wife.getIssueDate()));
            stmt.setLong(23, wife.getIssueDepartment().getOfficeId());
            Adress w_address = wife.getAdress();
            stmt.setString(24, w_address.getPostCode());
            stmt.setLong(25, w_address.getStreet().getStreetCode());
            stmt.setString(26, w_address.getBuilding());
            stmt.setString(27, w_address.getExtension());
            stmt.setString(28, w_address.getApartment());

            // Marriage
            stmt.setString(29, so.getMarrigeCertificateId());
            stmt.setLong(30, so.getMarrigeOffice().getOfficeId());
            stmt.setDate(31, java.sql.Date.valueOf(so.getMarrigeDate()));

            stmt.executeUpdate();

            ResultSet gkRs = stmt.getGeneratedKeys();
            if (gkRs.next()) {
                result = gkRs.getLong(1);
            }
            gkRs.close();
        } catch (SQLException ex) {
            throw new DaoException(ex);
        }
    return result;
    }

    private void setParamsForAdult(PreparedStatement stmt, int start, Adult adult) throws SQLException {
        stmt.setString(start, adult.getSurName());
        stmt.setString(start + 1, adult.getGivenName());
        stmt.setString(start + 2, adult.getPatronymic());
        stmt.setDate(start + 3, Date.valueOf(adult.getDateOfBirth()));
        stmt.setString(start + 4, adult.getPassportSeria());
        stmt.setString(start + 5, adult.getPassportNumber());
        stmt.setDate(start + 6, Date.valueOf(adult.getIssueDate()));
        stmt.setLong(start + 7, adult.getIssueDepartment().getOfficeId());
        Adress address = adult.getAdress();
        stmt.setString(start + 8, address.getPostCode());
        stmt.setLong(start + 9, address.getStreet().getStreetCode());
        stmt.setString(start + 10, address.getBuilding());
        stmt.setString(start + 11, address.getExtension());
        stmt.setString(start + 12, address.getApartment());
    }
}
