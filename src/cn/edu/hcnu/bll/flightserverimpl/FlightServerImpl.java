package cn.edu.hcnu.bll.flightserverimpl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightServer;

import java.util.Set;

public class FlightServerImpl implements IFlightServer {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println("界面传来的信息" + flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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
