package sunday.app.bairead.DataBase;

import sunday.app.bairead.Parse.HtmlParse;

/**
 * Created by sunday on 2016/12/8.
 */

public  class WebInfo{
    /**
     * 站内搜索使用百度引擎的SID
     * 访问方式var url = "http://zhannei.baidu.com/cse/search?s=5334330359795686106&q="
     * + encodeURIComponent(书名);
     * */

    public static final int NAME = 0;
    public static final int LINK = 1;
    public static final int CUS_ID = 2;

    public static final String[][] TOP_WEB= {
            {"笔趣阁","http://www.biquge.com/","http://zhannei.baidu.com/cse/search?s=287293036948159515&q="},
            {"新笔趣阁","http://www.xxbiquge.com/","http://zhannei.baidu.com/cse/search?s=8823758711381329060&q="},
            {"顶点小说","http://www.23wx.com/","http://zhannei.baidu.com/cse/search?s=15772447660171623812&q="},
            {"假顶点小说","http://www.23us.so/","http://zhannei.baidu.com/cse/search?s=17233375349940438896&q="},
            {"无错小说","http://www.quledu.com/","http://zhannei.baidu.com/cse/search?s=14724046118796340648&q="},
            };


    private String name;
    private String link;
    private String searchLink;
    private HtmlParse htmlParse;

    public WebInfo(String name,String link,String searchLink){
        this.name = name;
        this.link = link;
        this.searchLink = searchLink;
    }


    public String getName(){
        return name;
    }

    public String getLink(){
        return searchLink;
    }



    public void setParse(HtmlParse htmlParse){
        this.htmlParse = htmlParse;
    }

    public HtmlParse getParse(){
        return htmlParse;
    }

}



