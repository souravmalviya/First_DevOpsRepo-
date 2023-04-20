FROM php
COPY ./ ./
EXPOSE 3000
CMD ["php","-S","0.0.0.0:3000"]


//docker build . -t sourav1602/raitstd run this in cmd
