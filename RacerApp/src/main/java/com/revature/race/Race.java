package com.revature.race;

import com.revature.racer.Racer;

public class Race {

    private Racer leader;
    private Racer loser;

    public Racer getLeader() {
        return leader;
    }

    public void setLeader(Racer racer) {
        this.leader = leader;
    }

    public Racer getLoser() {
        return loser;
    }

    public void setLoser(Racer racer) {
        this.loser = loser;
    }

    public void raceTime(Racer a, Racer b){

        // compare acc of racer a and racer b
        //print who's leading

        if ( a.getAcceleration() < b.getAcceleration()){
//            setLeader(b);

//            this.setLoser(a);
            System.out.println(b.getName() + " is in the lead!");
            System.out.println(a.getName() + " uses their special item " + a.getSpecialItem());
            getLeader().setSpeed(b.getSpeed() / 2);
            if (getLeader().getSpeed() < a.getSpeed()){
                System.out.println("The winner is " + a.getName());
            }
            else {
                System.out.println("The winner is " +b.getName());
            }
        } else {
            this.setLeader(a);
            this.setLoser(b);
            System.out.println(this.getLeader() + " is in the lead!");
            System.out.println(getLoser().getName() + " uses their special item " + getLoser().getSpecialItem());
            getLeader().setSpeed(getLeader().getSpeed() / 2);
            if (getLeader().getSpeed() < getLoser().getSpeed()){
                System.out.println("The winner is " + getLoser().getName());
            }
            else {
                System.out.println("The winner is " + getLeader().getName());
            }
        }

        // subtract special time from speed


        //then we're going to calculate the speed the racers are going in comparison to track length
        //print out the winner.
    }

    public void compareAcceleration(Racer a, Racer b){

    }
}
