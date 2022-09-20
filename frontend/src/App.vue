<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <!-- <div class="d-flex align-center">
        <v-btn
            text
            to="/"
        >
            <span>Home</span>
        </v-btn>
        <v-menu offset-y class="ml-5">
            <template v-slot:activator="{on, attrs}">
                <v-btn
                    color="primary"
                    dark
                    v-bind="attrs"
                    v-on="on">
                    DropDown
                </v-btn>
            </template>
            <v-list>
                <v-list-item
                    v-for="(item, idx) in items"
                    :key="idx">
                    <v-list-item-title>{{item.title}}</v-list-item-title>
                </v-list-item>
            </v-list>
        </v-menu>
      </div>

      <v-spacer></v-spacer>

      <v-btn
        href="https://github.com/vuetifyjs/vuetify/releases/latest"
        text
        to="/route/about"
      >
        <span class="mr-2">Latest Release</span>
        <v-icon>mdi-open-in-new</v-icon>
      </v-btn> -->
      <div>
          <v-container>
              <v-row>
                <v-col>
                    <v-btn
                        text
                        to="/">
                        <span>Home</span>
                    </v-btn>
                </v-col>
                <v-col>
                    <v-btn
                        text
                        to="/route/about">
                        <span>about</span>
                    </v-btn>
                </v-col>
                <v-col>
                    <v-btn
                        text
                        to="/route/mall?page=20">
                        <span>mall</span>
                    </v-btn>
                </v-col>
              </v-row>
          </v-container>
      </div>
    </v-app-bar>
    <v-main>
      <router-view/>
      <!-- <img src="/uploads/test.jpg" /> -->
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    //
    items: [
        {title: 'click me'},
        {title: 'click me'},
        {title: 'click me'},
        {title: 'click me'},
        {title: 'click me'},
    ]
  }),
};
</script>
