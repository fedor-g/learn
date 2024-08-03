package com.example;


import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class Sandbox {


    @Test
    public void doSmth() throws ExecutionException, InterruptedException {
        String s = """
                {
                  "ConceptSets" : [
                    {
                      "id" : 3,
                      "name" : "Nausea or Vomiting",
                      "expression" : {
                        "items" : [
                          {
                            "concept" : {
                              "CONCEPT_CLASS_ID" : "Clinical Finding",
                              "CONCEPT_CODE" : "422587007",
                              "CONCEPT_ID" : 31967,
                              "CONCEPT_NAME" : "Nausea",
                              "DOMAIN_ID" : "Condition",
                              "INVALID_REASON" : "V",
                              "INVALID_REASON_CAPTION" : "Valid",
                              "STANDARD_CONCEPT" : "S",
                              "STANDARD_CONCEPT_CAPTION" : "Standard",
                              "VOCABULARY_ID" : "SNOMED"
                            },
                            "includeDescendants" : true
                          }
                        ]
                      }
                    }
                  ],
                  "PrimaryCriteria" : {
                    "CriteriaList" : [
                      {
                        "VisitOccurrence": {}
                      }
                    ],
                    "ObservationWindow" : {
                      "PriorDays" : 0,
                      "PostDays" : 0
                    },
                    "PrimaryCriteriaLimit" : {
                      "Type" : "All"
                    }
                  },
                  "QualifiedLimit" : {
                    "Type" : "First"
                  },
                  "ExpressionLimit" : {
                    "Type" : "All"
                  },
                  "InclusionRules" : [],
                  "EndStrategy" : {
                    "DateOffset" : {
                      "DateField" : "EndDate",
                      "Offset" : 0
                    }
                  },
                  "CensoringCriteria" : [],
                  "CollapseSettings" : {
                    "CollapseType" : "ERA",
                    "EraPad" : 0
                  },
                  "CensorWindow" : {},
                  "cdmVersionRange" : ">=5.0.0"
                }
                """;
        String encode = URLEncoder.encode(s, StandardCharsets.UTF_8);
        String decode = URLDecoder.decode(encode, StandardCharsets.UTF_8);

        System.out.println(encode);
    }




}
