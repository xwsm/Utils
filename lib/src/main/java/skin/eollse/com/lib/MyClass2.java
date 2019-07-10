package skin.eollse.com.lib;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import javax.jws.WebService;
import javax.rmi.CORBA.Util;


@WebService
public class MyClass2 {


    public static void main(String[] args) {
        Utils.isIdCard("53010219200508011X");
     /*  int x=5*7+1*9+1*10+3*5+2*8+1*4+1*2+9*1+9*6+5*3+1*7+2*9+0*10+8*5+1*8+7*4+5*2;
       int y=x%11;
       System.out.println(x);
        //1－0－X －9－8－7－6－5－4－3－2
       System.out.println(y);*/
    }


}
