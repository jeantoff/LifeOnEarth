package com.trolltech.games.model;

/**
 * Created by jbouvard on 13/04/2017.
 */
public class GenesCatalogElement {
    public enum geneExpression{
        Dominant,
        Recessive
    }

    String criteria;
    geneExpression expression;
}
