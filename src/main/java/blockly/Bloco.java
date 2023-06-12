package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco {

public static final int TIMEOUT = 300;

/**
 *
 * Bloco
 *
 * @author Guilherme Mateus Do Carmo
 * @since 26/04/2023, 08:26:56
 *
 */
public static Var teste() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.conversion.Operations.arrayToList(Var.VAR_NULL);
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Guilherme Mateus Do Carmo
 * @since 26/04/2023, 08:26:56
 *
 */
public static void teste2() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @author Guilherme Mateus Do Carmo
 * @since 26/04/2023, 08:26:56
 *
 */
public static void teste3() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
   return Var.VAR_NULL;
   }
 }.call();
}

}

