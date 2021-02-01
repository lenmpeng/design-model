package com.sise.迪米特法则;

/**
 * The type Lo dtest.
 *
 * @author lenm
 * @date 2021 /2/1 15:06
 */
public class LoDtest {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("林心如"));
        agent.setFans(new Fans("粉丝韩丞"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}

/**
 * 经纪人
 */
class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;

    /**
     * Sets star.
     *
     * @param myStar the my star
     */
    public void setStar(Star myStar) {
        this.myStar = myStar;
    }

    /**
     * Sets fans.
     *
     * @param myFans the my fans
     */
    public void setFans(Fans myFans) {
        this.myFans = myFans;
    }

    /**
     * Sets company.
     *
     * @param myCompany the my company
     */
    public void setCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    /**
     * Meeting.
     */
    public void meeting() {
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面了。");
    }

    /**
     * Business.
     */
    public void business() {
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "洽淡业务。");
    }
}

/**
 *明星
 */
class Star {
    private String name;

    /**
     * Instantiates a new Star.
     *
     * @param name the name
     */
    Star(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}

/**
 * 粉丝
 */

class Fans {
    private String name;

    /**
     * Instantiates a new Fans.
     *
     * @param name the name
     */
    Fans(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}

/**
 * 媒体公司
 */
class Company {
    private String name;

    /**
     * Instantiates a new Company.
     *
     * @param name the name
     */
    Company(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}