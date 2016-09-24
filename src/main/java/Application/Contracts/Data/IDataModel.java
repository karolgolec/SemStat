package Application.Contracts.Data;

import java.util.Calendar;

/**
 * Created by IntelliJ IDEA.
 * User: Karol Golec
 * Date: 23.09.2016
 * Time: 19:15
 */
public interface IDataModel {
    void setDomain(String domain);

    void setUrl(String url);

    void setQuantity(Integer quantity);

    void setDate(Calendar date);

    void setKeyword(String keyword);

    String getDomain();

    String getUrl();

    Integer getQuantity();

    Calendar getDate();

    String getKeyword();
}
