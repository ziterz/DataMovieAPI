package com.ziterz.moviedb.data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by ziterz on 6/11/2017.
 */

public class DataMovie
{
    @SerializedName("results")
    private ArrayList<Results> results;
    @SerializedName("page")
    private String page;
    @SerializedName("total_pages")
    private String total_pages;
    @SerializedName("total_results")
    private String total_results;

    public ArrayList<Results> getResults ()
    {
        return results;
    }

    public void setResults (ArrayList<Results> results)
    {
        this.results = results;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getTotal_pages ()
    {
        return total_pages;
    }

    public void setTotal_pages (String total_pages)
    {
        this.total_pages = total_pages;
    }

    public String getTotal_results ()
    {
        return total_results;
    }

    public void setTotal_results (String total_results)
    {
        this.total_results = total_results;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [results = "+results+", page = "+page+", total_pages = "+total_pages+", total_results = "+total_results+"]";
    }
}