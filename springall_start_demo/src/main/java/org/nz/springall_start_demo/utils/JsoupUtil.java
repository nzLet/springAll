package org.nz.springall_start_demo.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;


/**
 * XSS过滤工具
 */
public class JsoupUtil {
    private static final Whitelist whitelist = Whitelist.basicWithImages();
    //配置过滤化参数，不对代码进行格式化
    private static final Document.OutputSettings outputSettings =
            new Document.OutputSettings().prettyPrint(false);
    static {
        //富文本编辑时一些样式是使用style来进行实现的，所以需要给所有标签添加style属性
        whitelist.addAttributes(":all", "style");
    }
    public static  String clean(String content){
        return Jsoup.clean(content,"",whitelist,outputSettings);
    }
}
