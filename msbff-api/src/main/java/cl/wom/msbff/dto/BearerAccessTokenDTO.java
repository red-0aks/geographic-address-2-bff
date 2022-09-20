package cl.wom.msbff.dto;

import lombok.Data;

@Data
public class BearerAccessTokenDTO {

   private String accessToken;

   private Integer expiresIn;

   private Integer refreshExpiresIn;

   private String refreshToken;

   private String tokenType;

   private Integer notBeforePolicy;

   private String sessionState;
}
