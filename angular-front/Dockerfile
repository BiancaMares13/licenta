FROM node


RUN mkdir -p /opt/client-ui/src
WORKDIR /opt/client-ui  



COPY package.json /opt/client-ui/
COPY package-lock.json /opt/client-ui/
COPY .angular-cli.json /opt/client-ui/
COPY tslint.json /opt/client-ui/
COPY tsconfig.json /opt/client-ui/
ADD src/ /opt/client-ui/src

RUN npm install 

EXPOSE 4200
 
CMD ["npm", "start"]