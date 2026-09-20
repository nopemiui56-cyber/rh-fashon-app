# R.H Fashon Android App — Daraz-style native shopping UI

Native Android shopping app for https://rh.free.je/ with:
- Home, categories, search, product details, cart and account/tracking entry points
- WooCommerce Store API integration for products/categories
- Bengali Taka formatting
- Image loading without third-party libraries
- Local cart with quantity controls
- Checkout hand-off to the existing WooCommerce checkout page
- Pull-to-refresh style reload via toolbar refresh

## Build
Open this folder in Android Studio and let Gradle sync. Then Run or Build > Generate Signed App Bundle / APK.

## API
The app uses WooCommerce Store API endpoints under `/wp-json/wc/store/v1/`. No WooCommerce consumer key is embedded for public catalog browsing.

If your hosting/WAF blocks API requests, allow:
`/wp-json/wc/store/v1/products*` and `/wp-json/wc/store/v1/products/categories*`

## Main settings
Edit `Api.java` if the store domain changes. Checkout URL is derived from the same domain.
