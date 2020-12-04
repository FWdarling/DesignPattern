package converter;

import java.util.function.Function;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 11:56 2020/11/13
 * @Modified By:
 **/
public class Converter<T,U> {

    /**
     A Function Interface implemented by the class that inherits from Converter.
     The function includes specific rules to converter Data Transfer Object to Visual Object.
     **/
    private Function<T,U> fromDTO;
    /**
     A Function Interface implemented by the class that inherits from Converter.
     The function includes specific rules to converter Visual Object to Data Transfer Object.
     **/
    private Function<U,T> toDTO;

    /**
     Constructor for Converter.

     Args:
        final Function<TransactionDTO, TransactionVO> fromDTO: A specific function that convert DTO to VO.
        final TransactionConverter.TransactiontoDTO toDTO:A specific function that convert VO to DTO.

     Return:
     **/
    public Converter(final Function<TransactionDTO, TransactionVO> fromDTO, final TransactionConverter.TransactiontoDTO toDTO){
        this.fromDTO= (Function<T, U>) fromDTO;
        this.toDTO= (Function<U, T>) toDTO;
    }

    /**
     The universal interface for the different application of the specific conversion from DTO to VO,the interface is exposed
     to the users and the real implementation is in the fromDTO function.

     Args:
        DTO

     Return:
        VO
     **/
    public final U convertFromDTO(final T DTO){
        return fromDTO.apply(DTO);
    }


    /**
     The universal interface for the different application of the specific conversion from VO to DTO,the interface is exposed
     to the users and the real implementation is in the toDTO function.

     Args:
        VO

     Return:
        DTO
     **/
    public final T convertToDTO(final U VO){
        return toDTO.apply(VO);
    }

}
