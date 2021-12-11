<template>
  <div class="signUp_user">
    <div class="container_signUp_user">
      <h2>Registrarse</h2>

      <form v-on:submit.prevent="processSignUp">
        <input type="text" v-model="user.document" placeholder="Documento" />
        <br />

        <input type="password" v-model="user.password" placeholder="Contraseña" />
        <br />

        <input type="text" v-model="user.name" placeholder="Nombre" />
        <br />

        <input type="email" v-model="user.email" placeholder="Correo" />
        <br />

        <input type="number" v-model="user.phone" placeholder="Telefono" />
        <br />

        <input type="date" v-model="user.date_of_birth" placeholder="Fecha Nacimiento" />
        <br />

        <input type="text" v-model="user.address" placeholder="Dirección" />
        <br />

        <input type="text" v-model="user.city" placeholder="Ciudad" />
        <br />

        <button type="submit">Registrarse</button>
      </form>
    </div>
  </div>
</template>




<script>
import gql from "graphql-tag";

export default {
  name: "SignUp",

  data: function () {
    return {
      user: {
        document: "",
        password: "",
        name: "",
        email: "",
        phone: "",
        date_of_birth: "",
        address: "",
        city: "",
      },
    };
  },

  methods: {
    processSignUp: async function () {
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation ($userInput: SignUpInput!) {
              signUpUser(userInput: $userInput) {
                refresh
                access
              }
            }
          `,
          variables: {
            userInput: this.user,
          },
        })
        .then((result) => {
          let dataLogIn = {
            document: this.user.document,
            token_access: result.data.signUpUser.access,
            token_refresh: result.data.signUpUser.refresh,
          };
          this.$emit("completedSignUp", dataLogIn);
        })
        .catch((error) => {
          alert("ERROR: Fallo en el registro.");
        });
    },
  },
}
</script>






<style>
.signUp_user {
  margin: 0;
  padding: 0%;
  height: 100%;
  width: 100%;

  display: flex;
  justify-content: center;
  align-items: center;
}

.container_signUp_user {
  border: 3px solid #283747;
  border-radius: 10px;
  width: 50%;
  height: 90%;

  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.signUp_user h2 {
  color: #283747;
}

.signUp_user form {
  width: 70%;
}

.signUp_user input {
  height: 40px;
  width: 100%;

  box-sizing: border-box;
  padding: 10px 20px;
  margin: 5px 0;

  border: 1px solid #283747;
}

.signUp_user button {
  width: 100%;
  height: 40px;

  color: #e5e7e9;
  background: #283747;
  border: 1px solid #e5e7e9;

  border-radius: 5px;
  padding: 10px 25px;
  margin: 5px 0 25px 0;
}

.signUp_user button:hover {
  color: #e5e7e9;
  background: crimson;
  border: 1px solid #283747;
}
</style>