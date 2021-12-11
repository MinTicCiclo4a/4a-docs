<template>
  <div id="Historial">
    <div class="container">
   
      <h2>
        Documento Paciente:
        <span>{{ document }}</span>
      </h2>
      <h2>
        Telefono:
        <span>{{ personaByDocument.phone }}</span>
      </h2>
      <h2>
        Fecha de Nacimiento:
        <span>{{ personaByDocument.date_of_birth.substring(0, 10) }}</span>
      </h2>
      <h2>
        Dirección:
        <span>{{ personaByDocument.address }}</span>
      </h2>
      <h2>
        Ciudad:
        <span>{{ personaByDocument.city }}</span>
      </h2>
    </div>

    <h2>Citas</h2>
    <div class="container-table">
      <table>
        <tr>
          <th>Especialidad</th>
          <th>Especialista</th>
          <th>Fecha Cita</th>
        
        </tr>
        <tr v-for="reservaCita in reservaCitaByDocument" :key="reservaCita.id">
          <td>{{ reservaCita.especialidadCita }}</td>
          <td>{{ reservaCita.especialistaCita }}</td>
          <td>{{ reservaCita.diaCita.substring(0, 10) }}</td>
          
        </tr>
      </table>
    </div>
  </div>
</template>


<script>
import gql from "graphql-tag";

export default {
  name: "Persona",
  data: function () {
    return {
      document: localStorage.getItem("document") || "none",
      reservaCitaByDocument: [],
      personaByDocument: {
       
        phone: "",
        date_of_birth: "",
        address: "",
        city: "",
      },
    };
  },

  apollo: {
    reservaCitaByDocument: {
      query: gql`
        query ($document: String!) {
          reservaCitaByDocument(document: $document) {
            documentPersona
            especialidadCita
            especialistaCita
            diaCita
          }
        }
      `,
      variables() {
        return {
          document: this.document,
        };
      },
    },
    personaByDocument: {
      query: gql`
        query ($document: String!) {
          personaByDocument(document: $document) {
            phone
            date_of_birth
            address
            city
          }
        }
      `,
      variables() {
        return {
          document: this.document,
        };
      },
    },
  },
  created: function () {
    this.$apollo.queries.reservaCitaByDocument.refetch();
    this.$apollo.queries.personaByDocument.refetch();
  },
};
</script>


<style>
#Historial {
  width: 100%;
  display: flex;
  justify-content: flex-start;
  align-items: center;
  flex-direction: column;
}
#Historial .container-table {
  width: 50%;
  max-height: 80px;
  overflow-y: scroll;
  overflow-x: hidden;
}
#Historial table {
  width: 100%;
  border-collapse: collapse;
  border: 1px solid rgba(0, 0, 0, 0.3);
}
#Historial table td,
#Historial table th {
  border: 1px solid #ddd;
  padding: 8px;
}
#Historial table tr:nth-child(even) {
  background-color: #f2f2f2;
}
#Historial table tr:hover {
  background-color: #ddd;
}
#Historial table th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: crimson;
  color: white;
}
#Historial > h2 {
  color: #283747;
  font-size: 25px;
}
#Historial .container {
  padding: 30px;
  border: 3px solid rgba(0, 0, 0, 0.3);
  border-radius: 20px;
  margin: 5% 0 1% 0;
}
#Historial .container h2 {
  font-size: 25px;
  color: #283747;
}
#Historial .container span {
  color: crimson;
  font-weight: bold;
}
</style>