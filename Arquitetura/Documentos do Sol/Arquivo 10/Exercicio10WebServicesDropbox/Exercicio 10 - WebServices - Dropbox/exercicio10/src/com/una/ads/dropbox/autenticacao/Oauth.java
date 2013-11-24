/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.ads.dropbox.autenticacao;

import com.dropbox.client2.session.Session;

/**
 *
 * @author edgard.cardoso
 */
public class Oauth {

    // Sua app_key e sua app_secret estão na página da sua aplicação no dropbox
    // Depois de ter logado acesse: https://www.dropbox.com/developers/apply
    // clique no link "options" da sua app
    public static final String APP_KEY = "coloque aqui sua app_key";
    public static final String APP_SECRET = "coloque aqui sua app_secret";
    // o key_token e sercret_token será gerado pela classe Autenticacao.java
    // Pegue os valores gerados por lá e cole aqui.
    public static final String KEY_TOKEN = "coloque aqui sua key_token";
    public static final String SECRET_TOKEN = "coloque aqui sua secret_token";
    
    public static final Session.AccessType ACCESS_TYPE = Session.AccessType.DROPBOX;
}
