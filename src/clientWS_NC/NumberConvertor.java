package clientWS_NC;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.soap.ws.calculator.Calculator;
import com.soap.ws.calculator.CalculatorSoap;
import com.soap.ws.client.NumberConversion;
import com.soap.ws.client.NumberConversionSoapType;

public class NumberConvertor {
    public NumberConvertor() {}
	
	public String convert2word(String inputStr) {
		BigInteger input_N = new BigInteger(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToWords(input_N);  
        return result;
	}
    
	public String add(String inputStr, String inputStr2) {
		BigInteger input_1 = new BigInteger(inputStr);
		BigInteger input_2 = new BigInteger(inputStr2);

		Calculator calc = new Calculator();
		CalculatorSoap calcSoap = calc.getCalculatorSoap();
		int result = calcSoap.add(input_1.intValue(), input_2.intValue());
		
        return String.valueOf(result);
	}
	
	public String divide(String inputStr, String inputStr2) {
		BigInteger input_1 = new BigInteger(inputStr);
		BigInteger input_2 = new BigInteger(inputStr2);

		Calculator calc = new Calculator();
		CalculatorSoap calcSoap = calc.getCalculatorSoap();
		int result = calcSoap.divide(input_1.intValue(), input_2.intValue());
		
        return String.valueOf(result);
	}
	
	public String substract(String inputStr, String inputStr2) {
		BigInteger input_1 = new BigInteger(inputStr);
		BigInteger input_2 = new BigInteger(inputStr2);

		Calculator calc = new Calculator();
		CalculatorSoap calcSoap = calc.getCalculatorSoap();
		int result = calcSoap.subtract(input_1.intValue(), input_2.intValue());
		
        return String.valueOf(result);
	}
	
	public String multiply(String inputStr, String inputStr2) {
		BigInteger input_1 = new BigInteger(inputStr);
		BigInteger input_2 = new BigInteger(inputStr2);

		Calculator calc = new Calculator();
		CalculatorSoap calcSoap = calc.getCalculatorSoap();
		int result = calcSoap.multiply(input_1.intValue(), input_2.intValue());
		
        return String.valueOf(result);
	}
	
	public String convert2dollars(String inputStr) {
		BigDecimal input_D = new BigDecimal(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToDollars(input_D);  
        return result;
	}
}
