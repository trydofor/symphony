package org.b3log.symphony.util;

import javax.servlet.http.Cookie;

/**
 * @author trydofor
 * @since 2017-10-12
 */
public class CookiesUtil {

    public static Cookie lastOne(String key, Cookie[] cookies) {
        if (key == null || cookies == null || cookies.length == 0) return null;

        Cookie cookie = null;
        for (final Cookie c : cookies) {
            if (key.equals(c.getName())) {
                cookie = c;
            }
        }
        return cookie;
    }
}
