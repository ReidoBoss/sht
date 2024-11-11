import { createFetch } from '@vueuse/core'

export default = createFetch({
  baseUrl: import.meta.env.VITE_API_URL!,
  fetchOptions: {
    mode: 'cors'
  }
})
