:: commandes d'execution de antlr sur une grammaire contenue dans un fichier de suffixe .g
:: appel par g2java nom-de-votre-grammaire-suffixe-par-g
:: exemple: ./g2java TP1.g

:: Commande si antlr-3.5.2-complete.jar est CELUI DU SHARE
java -cp  C:\Users\lodla\Documents\Cours\L3\Semestre6\BMO\DotUmlVersJava\librairies\antlr-3.5.2-complete.jar org.antlr.Tool %* C:\Users\lodla\Documents\Cours\L3\Semestre6\BMO\DotUmlVersJava\src\DotUml.g
pause
:: Commande si antlr-3.5.2-complete.jar EST COPIE SOUS VOTRE REPERTOIRE
::    -> pensez alors a indiquer le chemin correct
:: java -cp H:\...\antlr-3.5.2-complete.jar org.antlr.Tool %*


