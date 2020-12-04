package converter;

import entity.ExchangeRate;

import java.util.function.Function;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 15:40 2020/11/20
 * @Modified By:
 **/
public class TransactionConverter extends Converter<TransactionDTO,TransactionVO>{

    public TransactionConverter(){
        super(new TransactionfromDTO(), new TransactiontoDTO());
    }

    static class TransactionfromDTO implements Function<TransactionDTO,TransactionVO>{

        /**
         Read implementation of the conversion from DTO(Data Transfer Object) to VO(Visual Object).

         Args:
            TransactionDTO

         Return:
            TransactionVO
         **/
        @Override
        public TransactionVO apply(TransactionDTO dto){
            String account=dto.getAccount();
            String currencyType=dto.getCurrencyType();
            double amount=dto.getConvertedAmount();
            TransactionVO vo=new TransactionVO();
            ExchangeRate exchangeRate=new ExchangeRate();
            vo.setAccount(account);
            vo.setTargetCurrencyType(currencyType);
            vo.setAmount(amount*exchangeRate.getExchangeRateMap(currencyType));
            return vo;
        }

    }

    static class TransactiontoDTO implements Function<TransactionVO, TransactionDTO> {

        /**
         Read implementation of the conversion from VO(Visual Object) to DTO(Data Transfer Obeject).

         Args:
         TransactionVO

         Return:
         TransactionDTO
         **/
        @Override
        public TransactionDTO apply(TransactionVO vo){
            String account=vo.getAccount();
            String currencyType=vo.getTargetCurrencyType();
            double amount=vo.getAmount();
            TransactionDTO dto=new TransactionDTO();
            ExchangeRate exchangeRate=new ExchangeRate();
            dto.setAccount(account);
            dto.setCurrencyType(currencyType);
            dto.setConvertedAmount(amount/exchangeRate.getExchangeRateMap(currencyType));
            return dto;
        }

    }
}
