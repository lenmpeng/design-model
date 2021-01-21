package com.sise.责任链模式;


/**
 * 文本过滤功能类
 * @author lenm
 */
public class MessageProccer {
    private String message;
    private Filter[] filters = {new HtmlFilter(), new FaceFilter()};

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Process string.
     *
     * @return the string
     */
    public String process() {
        for (Filter filter : filters) {
            message = filter.doFilter(message);
        }
        return message;
    }

}
