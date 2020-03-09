package cn.itcast.webmagic.test;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

public class JobProcessor implements PageProcessor {
    //解析页面
    public void process(Page page) {
        //解析返回的数据page，并且把解析度结果放到ResultItems中
//        page.putField("div",page.getHtml().css("div.typecont span").regex(".*李白.*").all());

//        page.putField("div2",page.getHtml().xpath("//div[@class=title]/h1/text()"));
////        page.putField("div3",page.getHtml().css("div#typecont a").all());
//        page.putField("div4",page.getHtml().css("div.typecont span").regex(".*李白.*").get());
//
//        page.putField("div5",page.getHtml().css("div.typecont span").regex(".*李白.*").toString());
//
//        //获取链接
//        page.addTargetRequests(page.getHtml().css("div.typecont").links().regex(".*李白.*").all());
//        page.putField("url",page.getHtml().css("div.typecont a").all());
//        List<String> list = page.getHtml().css("div.typecont a").links().regex(".*/search/\?l=java.*").all();
//        for (String s : list) {
//
//        }
        page.putField("author", page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
        page.putField("name", page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());

        page.addTargetRequests(page.getHtml().links().regex("/shiwenv_.*").all());
    }
//    private Site site = Site.me();

    private Site site = Site.me().setRetryTimes(3).setSleepTime(10);

    public Site getSite() {
        // setRetryTimes 设置重试次数
        // setSleepTime 设置时间间隔（毫秒） 默认5秒
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new JobProcessor()).addUrl("https://so.gushiwen.org/gushi/tangshi.aspx").run();
    }
}
