package com.example.demo.template;

public class HtmlTemplate {
    public String template;

    public String getTemplate() {
        return template;
    }

    public HtmlTemplate(String component) {
        this.template = String.format(
                """
                        <!DOCTYPE html>
                        <html lang="en">
                          <head>
                            <meta charset="UTF-8" />
                            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                            <meta http-equiv="X-UA-Compatible" content="ie=edge" />
                            <title>HTML 5 Boilerplate</title>
                            <link rel="stylesheet" href="style.css" />
                            <!-- Font Awesome -->
                            <link
                              href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
                              rel="stylesheet"
                            />
                            <!-- Google Fonts -->
                            <link
                              href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
                              rel="stylesheet"
                            />
                            <!-- MDB -->
                            <link
                              href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.css"
                              rel="stylesheet"
                            />
                            <style>
                              body {
                                display: flex;
                                justify-content: center;
                                align-items: center;
                                flex-direction: column;
                                background-color: black;
                                color: white;
                                min-width: 100vh;
                                min-height: 100vh;
                              }
                            </style>
                          </head>

                          <body>
                          <h1>Login to Spring Boot App</h1>
                          <br>
                            %s
                            <!-- MDB -->
                            <script
                              type="text/javascript"
                              src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.2/mdb.min.js"
                            ></script>
                          </body>
                        </html>

                                        """,
                component);
    }
}