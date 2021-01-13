package cn.edu.hcnu.bll.flightserverimpl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServer;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.iml.Flightiml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServerImpl implements IFlightServer {
    IFlightDao iflightDao;
    public FlightServerImpl(){
        iflightDao=new Flightiml();
    }

    @Override
   public void insertFlight(Flight flight) throws SQLException {
       iflightDao.insertFlight(flight);
}

    @Override
    public Set<Flight> getAllFlights() throws SQLException{

        return iflightDao.getAllFlights();
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
