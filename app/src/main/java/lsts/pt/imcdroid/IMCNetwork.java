package lsts.pt.imcdroid;

import org.androidannotations.annotations.EBean;

import pt.lsts.imc.net.ConnectFilter;
import pt.lsts.imc.net.IMCProtocol;

/**
 * Created by zp on 23-02-2017.
 */
@EBean
public class IMCNetwork extends IMCProtocol {

    public IMCNetwork() {
        super();
        setAutoConnect(ConnectFilter.VEHICLES_ONLY);
    }



}
