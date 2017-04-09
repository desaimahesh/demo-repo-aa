## Paths
### errorHtml
```
HEAD /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
GET /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
PATCH /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
PUT /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
DELETE /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
POST /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|201|Created|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### errorHtml
```
OPTIONS /error
```

#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|ModelAndView|
|204|No Content|No Content|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|


#### Consumes

* application/json

#### Produces

* text/html

#### Tags

* basic-error-controller

### sayHello
```
GET /hello-world
```

#### Parameters
|Type|Name|Description|Required|Schema|Default|
|----|----|----|----|----|----|
|QueryParameter|name|name|false|string|Stranger|


#### Responses
|HTTP Code|Description|Schema|
|----|----|----|
|200|OK|string|
|401|Unauthorized|No Content|
|403|Forbidden|No Content|
|404|Not Found|No Content|


#### Consumes

* application/json

#### Produces

* */*

#### Tags

* hello-world-controller

