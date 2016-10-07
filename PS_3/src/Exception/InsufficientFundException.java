package Exception;

import java.io.*;

/**
 * Custom class for throwing an insufficient funds exception
 * @author Dad
 *
 */
public class InsufficientFundException extends Exception
{
   private double amount;
   /**
    * Create an instance of the InsufficientFundsException class, to be thrown to the caller
    * @param amount
    */
   public InsufficientFundException(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }
}