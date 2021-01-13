package cn.edu.hcnu.dao.iml;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class Flightiml implements IFlightDao {

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
       PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlanetype());
        pstmt.setInt(4,flight.getDangqianSeatsNum());
        pstmt.setString(5,flight.getForm());
        pstmt.setString(6,flight.getTo());
        pstmt.setString(7,flight.getFormtime());

        pstmt.executeUpdate();

    }


    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        Set<Flight> allFlights=new HashSet<Flight>();
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            String id=rs.getString("ID");
            String flightId=rs.getString("FLIGHT_ID");
            String planetype=rs.getString("PLANE_TYPE");
            int dangqianSeatsNum=rs.getInt("TOTAL_SEATS_NUM");
            String form=rs.getString("DEPARTURE_AIRPORT");
            String to=rs.getString("DESTINATION_AIRPORT");
            String formtime=rs.getString("DEPARTURE_TIME");

            Flight flight = new Flight(id, flightId, planetype, dangqianSeatsNum, form, to, formtime);
            allFlights.add(flight);
        }
        return allFlights;
    }

    @Override
    public Flight getFlightByformtime(String formtime) {
        return null;
    }

    @Override
    public Flight getFlightByform(String form) {
        return null;
    }

    @Override
    public Flight getFlightByto(String to) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
