package lib;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HtmlUnitDemo {
    public static void main(String[] args) throws IOException {
        //无界面的浏览器（HTTP客户端）
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        //关闭了浏览器的js执行引擎，不再执行网页中的js脚本
        webClient.getOptions().setJavaScriptEnabled(false);
        //关闭了浏览器的css执行引擎，不再执行网页中的css布局
        webClient.getOptions().setCssEnabled(false);
        //以浏览器身份访问古诗文网站
        HtmlPage page = webClient.getPage("https://www.gushiwen.org/gushi/tangshi.aspx");
        System.out.println(page);
        //将获取到的数据方法目标目录下
        page.save(new File("target\\唐诗三百首\\列表页.html"));

        File file = n
        HtmlElement body = page.getBody();
        List<HtmlElement> element = body.getElementsByAttribute("div", "class", "typecont");


    }
}
