# Project 3

<p align="center">
  <a href="#">
    <img src="./img/logo.png" alt="Scandit logo" width="85" height="85">
  </a>
</p>

<h3 align="center">Scandit (Back-End Micro-services REST API)</h3>

<p align="center">
  Foodie is an a discussion forum where people post and comment on a food recipe. 
  <br>
    
  <br>
  ·
  <a href="https://www.pivotaltracker.com/n/projects/2416993">User Stories</a>
   ·
</p>

## Table of contents

- [User Stories](#user-stories)
- [Timeline](#timeline)
- [Architecture](#architecture)
- [API](#api)
- [API Responses](#responses)
- [Objects](#objects)
- [What's Included](#whats-included)
- [Creators](#developers)


## User Stories

[Pivotal Tracker (Back-End REST API)](https://www.pivotaltracker.com/n/projects/2416993)

Application Goals from User Stories are:
    
* Sign-up and Create Profile Foodie User
* Anyone can See Posts and Comments
* Signed-in user able to post a Post and comment
* Signed-in user able to delete it's own Posts and Comments

## Technology Used

   - Spring boot is used for the backend Services.
   - Zuul Eureka client is used for load-balancing between Services.
   - Zuul Gateway for Api-Gateway to forward api requests to Services. 
   - Postgres is Used for the database. 
   - Docker to run the services. 
   - Pivotal Cloud Foundry is used to deploy the application.
   
## General Approach

We discussed the architecture of the project and decided to use a database for each component. We figured out
how to proceed with the development and created the corresponding user stories that will lead us to completion.

We used pair programming and collaborated with each other and tried to stick to our schedule.

## Major Hurdles

   - Communication between services.
   - Integrity of Data. 


## Installation Instruction

Follow these easy step:
    

   1. Clone the repository:
        ```
        git clone https://github.com/gajjuCoderBoi/cognizant-p3
        ```
   2. Execute this on command line:
    
        ```
        $cd cognizant-p3
        $docker-compose up
        ```
   3. Enjoy
   

## Timeline

1. Requirement Analysis
    * Tuesday(Nov 12, 2019) - user stories
        
        We give our user stories points, so that we could prioritize our development steps. 
 
            https://www.pivotaltracker.com/n/projects/2416993
    
    * Wednesday(Nov 13, 2019) - ERD
        
            Pair mapped Architecture Diagram to include 5 services and their communications.
            
         [Architecture](#architecture)
         
    * Thursday(Nov 14, 2019) - User, comment, and post Service mapped.
    
            Added user, comment, and post creation functionality.
            
    * Friday(Nov 15, 2019) - Building.
    
            Running services on the Docker. And Building on the Docker and pushing the Docker images. 
        
    * Saturday(Nov 16, 2019) - Tested all route functionality and began testing.
    
            - All route functionality is working. Recorded results to ReadMe file.
            
            - Connect front-end with backend. 
            
    * Sunday(Oct 25, 2019) - Trying to deployee.
    
            *-*-*-*-*-*-*
        
      

  

## Architecture
##### Rough Sketch of Architecture Diagram.
![Architecture](./img/rough_architecture.jpg)

##### Soft Representation of Architecture Diagram.
![Architecture](./img/archi2.png)
    
    
     

## API
```text
Base URL: /, Version: 1.1

Default request content-types: application/json

Default response content-types: application/json

Schemes: http 
```
### Summary

<table style="
    width: 100%;
    max-width: 100%;
    margin-bottom: 20px;
    border: 1px solid #ddd;
    border-collapse: collapse;
    border-spacing: 0;
    background-color: transparent;
    display: table;
">
    <thead>
    <tr>
        <th>Path</th>
        <th>Operation</th>
        <th>Description</th>
        <th>Controller#Method</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2" style="border: 1px solid #ddd;padding: 5px;">
            <a href="#summary">/user/signup</a>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#post-usersignup">POST</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Create a User (Sign-up)</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>UserController#signup</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2" style="border: 1px solid #ddd;padding: 5px;">
            <a href="#summary">/user/login</a>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#post-userlogin">POST</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Create a login session.</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>UserController#login</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2" style="border: 1px solid #ddd;padding: 5px;">
            <a href="#summary">/user/reset</a>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#put-userreset">PUT</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Reset User Password.</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>UserController#reset</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="3">
            <a href="#summary">/profile</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-profile">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Retrieve the profile of the User. (Auth Token Required)</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>ProfileController#getProfile</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#post-profile">POST</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Create the profile of the User. (Auth Token Required)</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>ProfileController#createProfile</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#put-profile">PUT</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Update profile of the User. (Auth Token Required)</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>ProfileController#updateProfile</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2">
            <a href="#summary">/post</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-post">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Getting the Posts of the User (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#listPostByUser</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#post-post">POST</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Create a Posts of the User (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#addPost</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2" style="border: 1px solid #ddd;padding: 5px;">
            <a href="#summary">/post/list</a>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-postlist">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Retrieve all the posts.</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#listPost</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2">
            <a href="#">/post/{postId}</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#put-postid">PUT</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Updating a Post. (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#updatePost</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#delete-postid">DELETE</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Deleting a Post. (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#deletePost</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="1">
            <a href="#">/post/{postId}/comment/</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-postpostidcomment">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Retrieve all the comments of the a Post. </p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#listCommentsByPost</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="1">
            <a href="#summary">/comment</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-comment">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Retrieve all the comments. </p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>CommentController#listComments</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="1">
            <a href="#summary">/comment/list</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#get-commentlist">GET</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Retrieve all the comments of a User. (Auth Token Required). </p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>CommentController#listCommentsByUser</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="1">
            <a href="#">/comment/{postId}</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#post-commentpostid">POST</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Creating a comment on a post. (Auth Token Required). </p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>CommentController#addComment</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;" rowspan="2">
            <a href="#summary">/comment/{commentId}</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#put-commentcommentid">PUT</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Updating a comment. (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#updateComment</p>
        </td>
    </tr>
    <tr>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <a href="#delete-commentcommentid">DELETE</a>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>Deleting a Comment. (Auth Token Required).</p>
        </td>
        <td style="border: 1px solid #ddd;padding: 5px;">
            <p>PostController#deleteComment</p>
        </td>
    </tr>
    </tbody>
</table>
    
### Security

```text
tokenBasedAuth
type: Bearer Token

Description:

Basic HTTP authorization with Bearer Token.


* Bearer Token will be returned after login using 'username' and 'password'.
```
 
### Responses

#### POST /user/signup
Request Body 
```json5
{
	"username" : "myUser",
	"password" : "myPassword9"
}
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
{
    "username": "myUser",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJteVVzZXIiLCJleHAiOjE1NzIwMTkxMzAsImlhdCI6MTU3MTkzMjczMH0.3j4YpkvdiAkLBpW5PI1aBYZw1Uhf97gm67BwcNFFN0_pWIoZgrMt9xga1ximg1Xt-fMq5-v2ifE8B8sWTMP0EA"
}
```

#### POST /user/login
Authorization
```text
    token: Bearer Token
```
Request Body 
```json5
    {
    	"username" : "myUser",
    	"password" : "myPassword9"
    }
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
{
    "username": "myUser",
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJteVVzZXIiLCJleHAiOjE1NzIwMTkyMjcsImlhdCI6MTU3MTkzMjgyN30.Z9fh-cPXaVLAD9_I3k2w9JYn69lup6PrjtuxRIbUCkwUBHmzsIzhKKaO0sF8hkFJM1tWN61KrkQLl3fYhV9ZZQ"
}
```

#### PUT /user/reset
Authorization
```text
    token: Bearer Token
```
Request Body 
```json5
{
	"password" : "123"
}
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
    {
        "username": "myUser",
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJteVVzZXIiLCJleHAiOjE1NzIwMTkyMjcsImlhdCI6MTU3MTkzMjgyN30.Z9fh-cPXaVLAD9_I3k2w9JYn69lup6PrjtuxRIbUCkwUBHmzsIzhKKaO0sF8hkFJM1tWN61KrkQLl3fYhV9ZZQ"
    }
```

#### GET /profile
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
{
    "email": "myfake@email.com",
    "mobile": "123-123-1234",
    "address": "123 Fake Street"
}
```

#### POST /profile
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```

Request Body 
```json5
{
    	"address": "123 Fake Street",
    	"email": "myfake@email.com",
    	"mobile": "123-123-1234"
}
```
Response Body 
```json5
{
	"address": "123 Fake Street",
	"email": "myfake@email.com",
	"mobile": "123-123-1234"
}
```

#### PUT /profile
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```

Request Body 
```json5
{
	"address": "456 Fake Street",
	"email": "myfake@editedemail.com",
	"mobile": "456-123-1234"
}
```
Response Body 
```json5
{
    "email": "myfake@editedemail.com",
    "mobile": "456-123-1234",
    "address": "456 Fake Street"
}
```

#### GET /post/list
Response Header
```text
    Status: 200 OK
```

Response Body 
```json5
[
    {
        "postId": 1,
        "title": "1 title for my post",
        "postText": "1 My super important post.",
        "userName": "might"
    },
    {
        "postId": 2,
        "title": "1 title for my post",
        "postText": "1 My super important post.",
        "userName": "fright"
    },
    {
        "postId": 3,
        "title": "1 title for my post",
        "postText": "1 My super important post.",
        "userName": "fright"
    },
    {
        "postId": 5,
        "title": "my post title",
        "postText": "my post text",
        "userName": "might"
    },
    {
        "postId": 4,
        "title": "1 title for my post",
        "postText": "my edited post text",
        "userName": "fright"
    }
]
```

#### GET /post/
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
[
    {
        "postId": 6,
        "title": "myUser Post Title",
        "postText": "myUser Post Text",
        "userName": "myUser"
    }
]
```

#### POST /post
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```
Request Body 
```json5
{
	"title" : "myUser Post Title",
	"postText" : "myUser Post Text"
}
```
Response Body 
```json5
{
    "postId": 6,
    "title": "myUser Post Title",
    "postText": "myUser Post Text",
    "userName": "myUser"
}
```
#### PUT /{postId}
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```

Request Body 
```json5
{
	"postText" : "my edited post text for might"
}
```
Response Body 
```json5
{
    "postId": 5,
    "title": "my post title",
    "postText": "my edited post text for might",
    "userName": "might"
}
```
#### DELETE /post/{postId}
Authorization
```text
    token: Bearer Token
```
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
5
```

#### GET /post/{postId}/comment/
Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
[
    {
        "commentId": 1,
        "commentText": "Super Post Comment",
        "username": "might",
        "postTitle": "1 title for my post",
        "postid": "1"
    },
    {
        "commentId": 4,
        "commentText": "Super Fright Post Comment",
        "username": "fright",
        "postTitle": "1 title for my post",
        "postid": "1"
    },
    {
        "commentId": 2,
        "commentText": "Super Re-Edited Comment",
        "username": "fright",
        "postTitle": "1 title for my post",
        "postid": "1"
    }
]
```
#### POST /post/{postId}/comment/
Authorization
```text
    token: Bearer Token
```

Response Header
```text
    Status: 200 OK
```
Request Body 
```json5
{
	"commentText" : "Might comment on post"
}
```
Response Body 
```json5
{
    "commentId": 5,
    "commentText": "Might comment on post",
    "username": "might",
    "postTitle": "1 title for my post",
    "postid": "1"
}
```
#### GET /comment
Response Header
```text
    Status: 200 OK
```

Response Body 
```json5
[
    {
        "commentId": 5,
        "commentText": "Might comment on post",
        "username": "might",
        "postTitle": "1 title for my post",
        "postid": "1"
    },
    {
        "commentId": 6,
        "commentText": "Lorem ipsum",
        "username": "might",
        "postTitle": "1 title for my post",
        "postid": "1"
    },
]
```
#### GET /comment/list
Authorization
```text
    token: Bearer Token
```

Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
[
    {
        "commentId": 1,
        "commentText": "Some edited text by might",
        "username": "might",
        "postTitle": "1 title for my post",
        "postid": "1"
    }
]
```
#### POST /comment/{postId}
Authorization
```text
    token: Bearer Token
```

Response Header
```text
    Status: 200 OK
```
Request Body 
```json5
{
	"commentText" : "Some edited text by might"
}
```
Response Body 
```json5
{
    "commentId": 1,
    "commentText": "Some edited text by might",
    "username": "might",
    "postTitle": "1 title for my post",
    "postid": "1"
}
```
#### PUT /comment/{commentId}
Authorization
```text
    token: Bearer Token
```

Response Header
```text
    Status: 200 OK
```
Request Body 
```json5
{
	"commentText" : "Some edited text by might"
}
```
Response Body 
```json5
{
    "commentId": 1,
    "commentText": "Some edited text by might",
    "username": "might",
    "postTitle": "1 title for my post",
    "postid": "1"
}
```
#### DELETE /comment/{commentId}
Authorization
```text
    token: Bearer Token
```

Response Header
```text
    Status: 200 OK
```
Response Body 
```json5
1
```


    
### Objects

```text
User
 * Properties 
    -> userId : integer
    -> username : string
    -> passsword : string
    -> roles : List<Role>
    -> profile : UserProfile
    -> posts : List<Post>
    -> comments : List<Comment>
```

```text
Role
 * Properties 
    -> roleId : integer
    -> name : string
    -> users : List<User>
```

```text
Profile
 * Properties 
    -> profileId : integer
    -> email : string
    -> mobile : string
    -> address : string
    -> user : User
```

```text
Post
 * Properties 
    -> postId : integer
    -> title : string
    -> postText : string
    -> user : User
```

```text
Comment
 * Properties 
    -> commentId : integer
    -> commentText : string
    -> user : User
    -> post : Post
```

```text
JwtResponse
 * Properties 
    -> username : string
    -> jwt : string
```


## What's included

Within the download you'll find the following directories and files, logically grouping common assets and providing both compiled and minified variations. You'll see something like this:

```text
cognizant-p2/
├── API-Gateway
│   ├── Dockerfile
│   ├── manifest.yml
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── example
│       │   │           └── APIGateway
│       │   │               ├── TestController.java
│       │   │               └── ZuulGatewayApplication.java
│       │   └── resources
│       │       ├── application-dev.properties
│       │       ├── application-pcf.properties
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── example
│                       └── APIGateway
│                           └── ZuulGatewayApplicationTests.java
├── README.md
├── comments-api
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── ga
│       │   │           └── commentsapi
│       │   │               ├── CommentsApplication.java
│       │   │               ├── bean
│       │   │               │   ├── Post.java
│       │   │               │   └── User.java
│       │   │               ├── config
│       │   │               │   └── WebSecurityConfig.java
│       │   │               ├── controller
│       │   │               │   └── CommentController.java
│       │   │               ├── model
│       │   │               │   └── Comment.java
│       │   │               ├── repository
│       │   │               │   └── CommentRepository.java
│       │   │               └── service
│       │   │                   ├── CommentService.java
│       │   │                   └── CommentServiceImpl.java
│       │   └── resources
│       │       ├── application-dev.properties
│       │       ├── application-local.properties
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── ga
│                       └── commentsapi
│                           └── CommentsApplicationTests.java
├── deployment.sh
├── docker-compose.yml
├── eureka-server
│   ├── Dockerfile
│   ├── manifest.yml
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── example
│       │   │           └── eurekaserver
│       │   │               └── EurekaServerApplication.java
│       │   └── resources
│       │       ├── application-dev.properties
│       │       ├── application-pcf.properties
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── example
│                       └── eurekaserver
│                           └── EurekaServerApplicationTests.java
├── front-end
│   ├── css
│   │   ├── bootstrap-grid.css
│   │   ├── bootstrap-grid.css.map
│   │   ├── bootstrap-grid.min.css
│   │   ├── bootstrap-grid.min.css.map
│   │   ├── bootstrap-reboot.css
│   │   ├── bootstrap-reboot.css.map
│   │   ├── bootstrap-reboot.min.css
│   │   ├── bootstrap-reboot.min.css.map
│   │   ├── bootstrap.css
│   │   ├── bootstrap.css.map
│   │   ├── bootstrap.min.css
│   │   ├── bootstrap.min.css.map
│   │   ├── postwidget.css
│   │   └── style.css
│   ├── img
│   │   ├── Scanndit_Wire_Frame.png
│   │   ├── logo.png
│   │   ├── logo2.png
│   │   └── profile-placeholder.png
│   ├── index.html
│   ├── js
│   │   ├── api.js
│   │   ├── bootstrap.bundle.js
│   │   ├── bootstrap.bundle.js.map
│   │   ├── bootstrap.bundle.min.js
│   │   ├── bootstrap.bundle.min.js.map
│   │   ├── bootstrap.js
│   │   ├── bootstrap.js.map
│   │   ├── bootstrap.min.js
│   │   ├── bootstrap.min.js.map
│   │   ├── commentfeed.js
│   │   ├── index.js
│   │   ├── jquery-3.3.1.slim.min.js
│   │   ├── navbar.js
│   │   ├── popper.min.js
│   │   ├── post.js
│   │   ├── postfeed.js
│   │   └── profile.js
│   ├── post
│   │   └── index.html
│   ├── profile
│   │   ├── index.html
│   │   └── style.css
│   └── src
│       └── postwidget
│           └── postwidget.js
├── img
│   ├── ERD_2.png
│   ├── logo.png
│   └── rough_architecture.jpg
├── posts-api
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── ga
│       │   │           └── postsapi
│       │   │               ├── PostsApiApplication.java
│       │   │               ├── bean
│       │   │               │   ├── Comment.java
│       │   │               │   └── User.java
│       │   │               ├── cofig
│       │   │               │   └── WebSecurityConfig.java
│       │   │               ├── controller
│       │   │               │   └── PostController.java
│       │   │               ├── model
│       │   │               │   └── Post.java
│       │   │               ├── repository
│       │   │               │   └── PostRepository.java
│       │   │               └── service
│       │   │                   ├── PostService.java
│       │   │                   └── PostServiceImpl.java
│       │   └── resources
│       │       ├── application-dev.properties
│       │       ├── application-local.properties
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── ga
│                       └── postsapi
│                           └── PostsApiApplicationTests.java
├── profile-api
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── ga
│       │   │           └── profileapi
│       │   │               ├── ProfileAPIApplication.java
│       │   │               ├── config
│       │   │               │   └── WebSecurityConfig.java
│       │   │               ├── controller
│       │   │               │   └── ProfileController.java
│       │   │               ├── model
│       │   │               │   ├── Profile.java
│       │   │               │   └── User.java
│       │   │               ├── repository
│       │   │               │   └── ProfileRepository.java
│       │   │               └── service
│       │   │                   ├── ProfileService.java
│       │   │                   └── ProfileServiceImpl.java
│       │   └── resources
│       │       ├── application-dev.properties
│       │       ├── application-local.properties
│       │       └── application.properties
│       └── test
│           └── java
│               └── com
│                   └── ga
│                       └── profileapi
│                           └── ProfileAPIApplicationTests.java
└── users-api
    ├── Dockerfile
    ├── manifest.yml
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        │   ├── java
        │   │   └── com
        │   │       └── ga
        │   │           └── usersapi
        │   │               ├── UsersApiApplication.java
        │   │               ├── config
        │   │               │   ├── JwtRequestFilter.java
        │   │               │   ├── JwtUtil.java
        │   │               │   ├── SecurityConfig.java
        │   │               │   └── SecurityConfigInitializer.java
        │   │               ├── controller
        │   │               │   └── UserController.java
        │   │               ├── model
        │   │               │   ├── JwtResponse.java
        │   │               │   └── User.java
        │   │               ├── repository
        │   │               │   └── UserRepository.java
        │   │               └── service
        │   │                   ├── UserService.java
        │   │                   └── UserServiceImpl.java
        │   └── resources
        │       ├── application-dev.properties
        │       ├── application-local.properties
        │       ├── application-pcf.properties
        │       └── application.properties
        └── test
            └── java
                └── com
                    └── ga
                        └── usersapi
                            └── UsersApiApplicationTests.java



```
    
## Developers

**Carlos Kruger**

- <https://github.com/@carloskruger>

**Mohammad Javed**

- <https://github.com/gajjuCoderBoi>