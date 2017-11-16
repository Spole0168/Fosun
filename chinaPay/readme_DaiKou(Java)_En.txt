===============================================================
ChinaPay withholding interface demo (Java) instructions
===============================================================
/**
* @author hu.xuting
* 2012-04-18
*/
Instructions for using instance of ChinaPay interface calls(Java jdk1.6)
1¡¢This instance mainly implement the call of withhold payment,single query and add whitelist interfaces.

2¡¢Before running this instance,please modify corresponding configuration of /src/res/cp_config.properties file.
   The configurations which need to be modified are:
#MerchantID
chinapay.merid = 808080080988041

#MerchantKey FilePath
chinapay.merkey.filepath = F\:\\Workspace\\\u4EE3\u6263-key\\808080080988041-key\\MerPrk.key

#PublicKey FilePath
chinapay.pubkey.filepath = F\:\\Workspace\\\u4EE3\u6263-key\\808080080988041-key\\PgPubk.key


3¡¢After starting the project, could use this instance to visit http://localhost:8080/chinapay_java/index.jsp

