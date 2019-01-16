REM run.bat -u https://jitsimeet.magnet.com/http-bind/ -room 222 -users 1 -videortpdump ./resources/rtp_vp8.rtpdump -audiortpdump ./resources/narwhals-audio.rtpdump

@echo off
for /f "tokens=2 delims==" %%a in ('wmic OS Get localdatetime /value') do set "dt=%%a"
set "YY=%dt:~2,2%" & set "YYYY=%dt:~0,4%" & set "MM=%dt:~4,2%" & set "DD=%dt:~6,2%"
set "HH=%dt:~8,2%" & set "Min=%dt:~10,2%" & set "Sec=%dt:~12,2%"
set "fullstamp=%YYYY%-%MM%-%DD%_%HH%-%Min%-%Sec%"

REM "default keystore file, need to change according to actually site"
set KEYSTORE_FILE=jitsimeet.magnet.com.ks

set KEYSTORE_PWD="123456"
set SCRIPT_DIR=%cd%
set SC_HOME_DIR_LOCATION=%cd%
set SC_HOME_DIR_NAME=.jitsi-hammer
set LOG_HOME=%cd%/.jitsi-hammer/log


mvn exec:java -Dexec.args="%*" ^
  -Djavax.net.ssl.keyStore=%KEYSTORE_FILE% -Djavax.net.ssl.keyStorePassword=%KEYSTORE_PWD% ^
  -Djavax.net.ssl.trustStore=%KEYSTORE_FILE% -Djavax.net.ssl.trustStorePassword=%KEYSTORE_PWD% ^
  -Djava.util.logging.config.file=%SCRIPT_DIR%/lib/logging.properties ^
  -Dnet.java.sip.communicator.SC_HOME_DIR_LOCATION=%SC_HOME_DIR_LOCATION% ^
  -Dnet.java.sip.communicator.SC_HOME_DIR_NAME=%SC_HOME_DIR_NAME%  2>&1 | tee %LOG_HOME%/%fullstamp%.log
