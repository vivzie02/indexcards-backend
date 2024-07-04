package io.swagger.api;

import io.swagger.model.IndexCard;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-06-27T14:18:57.858700547Z[GMT]")
@RestController
public class IndexCardsApiController implements IndexCardsApi {

    private static final Logger log = LoggerFactory.getLogger(IndexCardsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IndexCardsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> indexCardsCardIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("cardId") UUID cardId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndexCard> indexCardsCardIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("cardId") UUID cardId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndexCard>(objectMapper.readValue("{\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n}", IndexCard.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndexCard>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndexCard>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndexCard> indexCardsCardIdPatch(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("cardId") UUID cardId
,@Parameter(in = ParameterIn.DEFAULT, description = "New information to update card", required=true, schema=@Schema()) @Valid @RequestBody IndexCard body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndexCard>(objectMapper.readValue("{\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n}", IndexCard.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndexCard>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndexCard>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<IndexCard>> indexCardsCollectionIdIndexCardsGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("collectionId") UUID collectionId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<IndexCard>>(objectMapper.readValue("[ {\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n}, {\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<IndexCard>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<IndexCard>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<IndexCard> indexCardsCollectionIdIndexCardsPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("collectionId") UUID collectionId
,@Parameter(in = ParameterIn.DEFAULT, description = "content of the index card", required=true, schema=@Schema()) @Valid @RequestBody IndexCard body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<IndexCard>(objectMapper.readValue("{\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n}", IndexCard.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<IndexCard>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<IndexCard>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<IndexCard>> indexCardsUserIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") UUID userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<IndexCard>>(objectMapper.readValue("[ {\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n}, {\n  \"backFormat\" : \"latin\",\n  \"backSide\" : \"Lisbon\",\n  \"cardId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\",\n  \"frontFormat\" : \"latin\",\n  \"frontSide\" : \"What is the capital of Portugal?\",\n  \"collectionId\" : \"9666e8bf-6f37-44d1-aab4-f2faaf6da243\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<IndexCard>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<IndexCard>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
