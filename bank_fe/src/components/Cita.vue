<template>
  <div id="Cita" class="cita">
    <div class="container_cita">
      <h2>Agendar Cita</h2>
      <form v-on:submit.prevent="processCita">
        <input
          type="text"
          v-model="createReservaCita.especialidadCita"
          placeholder="Especialidad"
        />
        <br />
        <input
          type="text"
          v-model="createReservaCita.especialistaCita"
          placeholder="Especialista"
        />
        <br />
        <input
          type="date"
          v-model="createReservaCita.diaCita"
          placeholder="Fecha cita"
        />
        <br />
        <button type="submit">Agendar Cita</button>
      </form>
    </div>
  </div>
</template>

<script>
import gql from "graphql-tag";

export default {
  name: "Cita",

  data: function () {
    return {
      createReservaCita: {
        documentPersona: localStorage.getItem("document"),
        especialidadCita: "",
        especialistaCita: "",
        diaCita: "",
      },
    };
  },
  methods: {
    processCita: async function () {
      if (
        localStorage.getItem("token_access") === null ||
        localStorage.getItem("token_refresh") === null
      ) {
        this.$emit("logOut");
        return;
      }

      localStorage.setItem("token_access", "");
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation ($refresh: String!) {
              refreshToken(refresh: $refresh) {
                access
              }
            }
          `,
          variables: {
            refresh: localStorage.getItem("token_refresh"),
          },
        })
        .then((result) => {
          localStorage.setItem("token_access", result.data.refreshToken.access);
        })
        .catch((error) => {
          this.$emit("logOut");
          return;
        });
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation ($reservaCita: ReservaCitaInput!) {
              createReservaCita(reservaCita: $reservaCita) {
              
                id
                documentPersona
                especialidadCita
                especialistaCita
                diaCita
              }
            }
          `,
          variables: {
            reservaCita: this.createReservaCita,
          },
        })
        .then((result) => {
          alert("Cita Agendada de Manera Correcta, Revise Historial");
        })
        .catch((error) => {
          alert("Saldo Insuficiente o Destino Incorrecto");
        });
    },
  },
};
</script>

<style>
.cita {
  margin: 0;
  padding: 0%;
  height: 100%;
  width: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.container_cita  {
  border: 3px solid #283747;
  border-radius: 10px;
  width: 25%;
  height: 60%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.cita h2 {
  color: #283747;
}
.cita form {
  width: 50%;
}
.cita input {
  height: 40px;
  width: 100%;
  box-sizing: border-box;
  padding: 10px 20px;
  margin: 5px 0;
  border: 1px solid #283747;
}
.cita button {
  width: 100%;
  height: 40px;
  color: #e5e7e9;
  background: #283747;
  border: 1px solid #e5e7e9;
  border-radius: 5px;
  padding: 10px 25px;
  margin: 5px 0;
}
.cita button:hover {
  color: #e5e7e9;
  background: crimson;
  border: 1px solid #283747;
}
</style>