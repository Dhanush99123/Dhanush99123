​40​ ​sloc​)  ​1.26​ ​KB 
 ​    
 ​import​ ​java​.​util​.*; 
 ​import​ ​javax​.​mail​.*; 
 ​import​ ​javax​.​mail​.​internet​.*; 
  
 ​public​ ​class​ ​SampleMail​ { 
  
 ​        ​public​ ​static​ ​void​ ​main​(​String​[] ​args​)  
 ​        { 
 ​                ​String​ ​host​ = ​"smtp.gmail.com"​; 
 ​                ​String​ ​user​=​"knrblj9@gmail.com"​; 
 ​                ​String​ ​pass​=​"balaji2001"​; 
 ​                 
 ​                ​String​ ​receiver​=​"knrblj@gmail.com"​; 
 ​                 
 ​                ​Properties​ ​props​ = ​new​ ​Properties​(); 
 ​                ​props​.​put​(​"mail.smtp.host"​, ​host​); 
 ​                ​props​.​put​(​"mail.smtp.port"​, ​"465"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.enable"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.auth"​, ​"true"​); 
 ​                ​props​.​put​(​"mail.smtp.ssl.protocols"​, ​"TLSv1.2"​); 
 ​                ​props​.​put​(​"mail.smtp.socketFactory.fallback"​, ​"true"​);  
  
  
 ​                ​Session​ ​session​ = ​Session​.​getDefaultInstance​(​props​,   
 ​                            ​new​ ​javax​.​mail​.​Authenticator​() {   
 ​                              ​protected​ ​PasswordAuthentication​ ​getPasswordAuthentication​() {   
 ​                            ​return​ ​new​ ​PasswordAuthentication​(​user​,​pass​);   
 ​                              }   
 ​                            });   
 ​        ​session​.​setDebug​(​true​); 
 ​                ​try 
 ​                { 
 ​                        ​MimeMessage​ ​message​=​new​ ​MimeMessage​(​session​); 
 ​                        ​message​.​setFrom​(​new​ ​InternetAddress​(​user​)); 
 ​                        ​message​.​setRecipient​(​Message​.​RecipientType​.​TO​, ​new​ ​InternetAddress​(​receiver​)); 
 ​                        ​message​.​setSubject​(​"Test Mailer"​); 
 ​                        ​message​.​setText​(​"Sent by java file as testing"​); 
 ​                         
 ​                        ​Transport​.​send​(​message​); 
 ​                        ​System​.​out​.​println​(​"Success"​); 
 ​                } 
 ​                ​catch​(​Exception​ ​e​) 
 ​                { 
 ​                        ​System​.​out​.​println​(​e​); 
 ​                } 
 ​        } 
  
 ​}
