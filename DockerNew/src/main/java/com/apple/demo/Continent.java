package com.apple.demo;

public class Continent
{
    private String continent;

    private Countries[] countries;

    public String getContinent ()
    {
        return continent;
    }

    public void setContinent (String continent)
    {
        this.continent = continent;
    }

    public Countries[] getCountries ()
    {
        return countries;
    }

    public void setCountries (Countries[] countries)
    {
        this.countries = countries;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [continent = "+continent+", countries = "+countries+"]";
    }
}
