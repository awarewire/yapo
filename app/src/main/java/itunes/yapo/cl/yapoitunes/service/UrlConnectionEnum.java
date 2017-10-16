package itunes.yapo.cl.yapoitunes.service;

/**
 * Created by jvalladares.
 */

public enum UrlConnectionEnum {

    URL_DOMINIO("https://itunes.apple.com");

    private String url;

    UrlConnectionEnum(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
