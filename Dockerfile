FROM openjdk:11

ARG username=nonroot
ARG username_home=/home/${username}/
ARG username_uid=1000
ARG username_gid=1000

RUN groupadd --gid $username_gid $username \
    && useradd -u $username_uid -g $username_gid --home-dir $username_home $username \
    && mkdir -p $username_home \
    && chown $username:$username -R $username_home

USER $username

WORKDIR $username_home

COPY --chown=$username:$username OlaUnicamp.java .

RUN javac OlaUnicamp.java

CMD java OlaUnicamp
