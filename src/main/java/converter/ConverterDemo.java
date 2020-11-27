package converter;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 16:05 2020/11/20
 * @Modified By:
 **/
public class ConverterDemo {
    public static void converterTest(){

        System.out.println("VO to DTO\n");
        String account="id_001";
        String currencyType="USD";
        double amount=100;


        TransactionVO transactionVOTest1=new TransactionVO();
        transactionVOTest1.setAmount(amount);
        transactionVOTest1.setTargetCurrencyType(currencyType);
        transactionVOTest1.setAccount(account);


        TransactionConverter transactionConverter=new TransactionConverter();

        System.out.println("                                        " +
                "[ TransactionDTO : convertToDTO() : 将存储交易信息的VO类型转换成DTO类型 ]");
        TransactionDTO transactionDTOTest1=transactionConverter.convertToDTO(transactionVOTest1);
        System.out.println("account:"+transactionDTOTest1.getAccount()+"\n");
        System.out.println("currencyType:"+transactionDTOTest1.getCurrencyType()+"\n");
        System.out.println("amount:"+transactionDTOTest1.getConvertedAmount()+"\n");
        System.out.println("DTO to VO\n");


        TransactionDTO transactionDTOTest2=new TransactionDTO();
        transactionDTOTest2.setConvertedAmount(amount);
        transactionDTOTest2.setCurrencyType(currencyType);
        transactionDTOTest2.setAccount(account);

        System.out.println("                                        " +
                "[ TransactionVO : convertFromDTO() : 将存储交易信息的DTO类型转换成VO类型 ]");
        TransactionVO transactionVOTest2=transactionConverter.convertFromDTO(transactionDTOTest2);
        System.out.println("account:"+transactionVOTest2.getAccount()+"\n");
        System.out.println("currencyType:"+transactionVOTest2.getTargetCurrencyType()+"\n");
        System.out.println("amount:"+transactionVOTest2.getAmount()+"\n");
    }
}
