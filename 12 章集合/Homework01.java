package 集合;/*
 *@author yang
 */

import java.util.ArrayList;
import java.util.Collections;

public class Homework01 {
    public static void main(String[] args) {
        News news = new News("xinguanquezhen");
        News news2 = new News("nanzituran");
        ArrayList list = new ArrayList();
        
        list.add(news);
        list.add(news2);
        int size = list.size();
        for (int i = size - 1; i >= 0 ; i--) {
            //System.out.println(list.get(i));
            News news3 = (News) list.get(i);
            System.out.println(processTitle(news3.getView()));
        }
        Collections.reverse(list);



    }

    //处理现实新闻标题
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }

        if (title.length() > 15) {
            return title.substring(0,15);
        } else {
            return title;
        }
    }

}
class News {
    private String view;
    private String neirong;

    public News(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    @Override
    public String toString() {
        return "News{" +
                "view='" + view;
    }
}