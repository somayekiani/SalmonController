package opencalais;

import java.rmi.Remote;

/**
 * Created by pooya_hy on 11/1/2018.
 */
public interface OpenCalais extends Remote {

    public String getTag() throws Exception;
}
