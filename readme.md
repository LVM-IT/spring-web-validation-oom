Request-Data is `attachement.json`, containing a name-field and a
base64 encoded byte-array with 6 million bytes. 

To produce an OutOfMemory Error with an 6MB-Request: 

* run springboot application with -mx256m
* `curl -X POST -H 'Content-Type: application/json' -d @attachement.json http://localhost:8080/attachements`

