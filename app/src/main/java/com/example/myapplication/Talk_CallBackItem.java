package com.example.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 마루소프트 on 2018-01-29.
 */

public class Talk_CallBackItem {
        public Talk_CallBackItem() {
            results = new ArrayList<>();
        }


    private ArrayList<Data> results;  //여기서 results를 맞춰줘야해

    public ArrayList<Data> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Talk_CallBackItem{" +
                "results=" + results +
                '}';
    }

    public class Data implements Serializable {
        int t_no;
        String t_user_id;
        String t_pwd;
        String t_title;
        String t_content;
        String t_write_date;
        int t_like;
        int t_r_count;

        public int getT_no() {
            return t_no;
        }

        public void setT_no(int t_no) {
            this.t_no = t_no;
        }

        public String getT_user_id() {
            return t_user_id;
        }

        public void setT_user_id(String t_user_id) {
            this.t_user_id = t_user_id;
        }

        public String getT_pwd() {
            return t_pwd;
        }

        public void setT_pwd(String t_pwd) {
            this.t_pwd = t_pwd;
        }

        public String getT_title() {
            return t_title;
        }

        public void setT_title(String t_title) {
            this.t_title = t_title;
        }

        public String getT_content() {
            return t_content;
        }

        public void setT_content(String t_content) {
            this.t_content = t_content;
        }

        public String getT_write_date() {
            return t_write_date;
        }

        public void setT_write_date(String t_write_date) {
            this.t_write_date = t_write_date;
        }

        public int getT_like() {
            return t_like;
        }

        public void setT_like(int t_like) {
            this.t_like = t_like;
        }

        public int getT_r_count() {
            return t_r_count;
        }
        public void setT_r_count(int t_r_count) {
            this.t_r_count = t_r_count;
        }

        public Data(int t_no, String t_user_id, String t_pwd, String t_title, String t_content, String t_write_date, int t_like, int t_r_count) {
            this.t_no = t_no;
            this.t_user_id = t_user_id;
            this.t_pwd = t_pwd;
            this.t_title = t_title;
            this.t_content = t_content;
            this.t_write_date = t_write_date;
            this.t_like = t_like;
            this.t_r_count = t_r_count;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "t_no=" + t_no +
                    ", t_user_id='" + t_user_id + '\'' +
                    ", t_pwd='" + t_pwd + '\'' +
                    ", t_title='" + t_title + '\'' +
                    ", t_content='" + t_content + '\'' +
                    ", t_write_date='" + t_write_date + '\'' +
                    ", t_like=" + t_like +
                    ", t_r_count=" + t_r_count +
                    '}';
        }
    }
}