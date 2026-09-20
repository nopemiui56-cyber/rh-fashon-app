# R.H Fashon — ফোন থেকে APK বানানো

এই project-এ GitHub Actions workflow যোগ করা আছে। ফোনে Android Studio/AndroidIDE লাগবে না।

## GitHub-এ আপলোড
1. GitHub-এ নতুন repository তৈরি করুন।
2. এই ZIP extract করুন এবং repository-তে সব ফাইল upload করুন।
3. `.github/workflows/android-build.yml` ফাইলটি আছে কিনা নিশ্চিত করুন।
4. GitHub-এর **Actions** tab খুলুন।
5. **Build R.H Fashon APK** workflow নির্বাচন করুন।
6. **Run workflow** চাপুন।
7. Build শেষ হলে workflow run খুলে **Artifacts** থেকে `rh-fashon-debug-apk` ZIP download করুন।
8. ZIP extract করলে `app-debug.apk` পাবেন।

## গুরুত্বপূর্ণ
- Repository private রাখা যেতে পারে।
- প্রথম build-এ কয়েক মিনিট লাগতে পারে।
- Build error হলে Actions-এর failed run-এর log/screenshot পাঠালে project ঠিক করে দেওয়া যাবে।
