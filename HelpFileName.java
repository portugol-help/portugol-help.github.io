/*    */ package Editor.help;
/*    */ 
/*    */ import Portugol.Language.Evaluate.CalculusElement;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HelpFileName
/*    */ {
/*    */   public static String getHelpFile(String word)
/*    */   {
/* 42 */     String keyword = "index";
/* 43 */     if (word.equalsIgnoreCase("se")) { keyword = "se";
/* 44 */     } else if (word.equalsIgnoreCase("entao")) { keyword = "se";
/* 45 */     } else if (word.equalsIgnoreCase("senao")) { keyword = "se";
/* 46 */     } else if (word.equalsIgnoreCase("fimse")) { keyword = "se";
/*    */ 
/*    */     }
/* 49 */     else if (word.equalsIgnoreCase("escolhe")) { keyword = "escolhe";
/* 50 */     } else if (word.equalsIgnoreCase("caso")) { keyword = "escolhe";
/* 51 */     } else if (word.equalsIgnoreCase("defeito")) { keyword = "escolhe";
/* 52 */     } else if (word.equalsIgnoreCase("fimescolhe")) { keyword = "escolhe";
/*    */     }
/* 54 */     else if (word.equalsIgnoreCase("enquanto")) { keyword = "enquanto";
/* 55 */     } else if (word.equalsIgnoreCase("fimenquanto")) { keyword = "enquanto";
/*    */     }
/* 57 */     else if (word.equalsIgnoreCase("repete")) { keyword = "repete";
/*    */     }
/* 59 */     else if (word.equalsIgnoreCase("faz")) { keyword = "faz";
/*    */     }
/* 61 */     else if (word.equalsIgnoreCase("para")) { keyword = "para";
/* 62 */     } else if (word.equalsIgnoreCase("passo")) { keyword = "para";
/*    */     }
/* 64 */     else if (word.equalsIgnoreCase("ler")) { keyword = "ler";
/* 65 */     } else if (word.equalsIgnoreCase("escrever")) { keyword = "escrever";
/*    */ 
/*    */     }
/* 68 */     else if (word.equalsIgnoreCase("INTEIRO")) { keyword = "tipo_dados_basicos";
/* 69 */     } else if (word.equalsIgnoreCase("REAL")) { keyword = "tipo_dados_basicos";
/* 70 */     } else if (word.equalsIgnoreCase("CARACTER")) { keyword = "tipo_dados_basicos";
/* 71 */     } else if (word.equalsIgnoreCase("LOGICO")) { keyword = "tipo_dados_basicos";
/* 72 */     } else if (word.equalsIgnoreCase("TEXTO")) { keyword = "tipo_dados_basicos";
/*    */     }
/* 74 */     else if (word.equalsIgnoreCase("CONSTANTE")) { keyword = "tipo_dados_constantes";
/* 75 */     } else if (word.equalsIgnoreCase("E")) { keyword = "operadores_logicos";
/* 76 */     } else if (word.equalsIgnoreCase("OU")) { keyword = "operadores_logicos";
/* 77 */     } else if (word.equalsIgnoreCase("NAO")) { keyword = "operadores_logicos";
/* 78 */     } else if (word.equalsIgnoreCase("VERDADEIRO")) { keyword = "operadores_logicos";
/* 79 */     } else if (word.equalsIgnoreCase("FALSO")) { keyword = "operadores_logicos";
/* 80 */     } else if (CalculusElement.IsFunction(word)) { keyword = "funcoes_biblioteca";
/*    */     } else {
/* 82 */       String opAritm = "+-*/%^";
/* 83 */       String opRelac = "<>=";
/* 84 */       if (opAritm.indexOf(word) != -1) { keyword = "operadores_aritmeticos";
/* 85 */       } else if (opRelac.indexOf(word) != -1) keyword = "operadores_relacionais";
/*    */     }
/* 87 */     return "Editor/help/" + keyword + ".html";
/*    */   }
/*    */ }


/* Location:              C:\Users\USER\Desktop\portugol\Portugol.jar!\Editor\help\HelpFileName.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */