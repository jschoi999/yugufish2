<template>
  <div>
    <!-- <v-text-field
      label="ID"
      :rules="rules"
      hide-details="auto"
    ></v-text-field>
    <v-text-field
      label="Password"
      :rules="rules"
      hide-details="auto"
      type="password"
      ></v-text-field> -->
<v-app>
      <v-main>
         <!-- <v-container fluid fill-height> -->
         <v-container fluid>
            <v-layout align-center justify-center>
               <v-flex xs12 sm8 md4>
                  <v-card class="elevation-12">
                     <v-toolbar dark color="primary">
                        <v-toolbar-title>관리자 로그인</v-toolbar-title>
                     </v-toolbar>
                     <v-card-text>
                        <v-form>
                           <v-text-field
                              name="login"
                              label="Login"
                              type="text"
                              v-model="adminId"
                           ></v-text-field>
                           <v-text-field
                              id="password"
                              name="password"
                              label="Password"
                              type="password"
                              v-model="adminPwd"
                           ></v-text-field>
                        </v-form>
                     </v-card-text>
                     <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn color="primary" @click="adminLogin">로그인</v-btn>
                     </v-card-actions>
                  </v-card>
               </v-flex>
            </v-layout>
         </v-container>
      </v-main>
   </v-app>
  </div>
</template>

<script>

  export default {
    name: 'AdminLogin',

    components: {
    },
    computed: {
    },
    methods: {
      adminLogin(){
        console.log(`id = ${adminId}`);
        console.log(`pwd = ${adminPw}`);
        
      },
    },
    data: ()=>({
      rules: [
        value => !!value || '값을 입력해주세요.',
      ],
      adminId: '',
      adminPw: '',
    }),
  }
</script>
