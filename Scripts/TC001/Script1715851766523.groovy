import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.139.47/ui-onboarding/')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/label_Syarat dan Ketentuan e-Form pada new _ff272b'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Belum Memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_ADART'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Amrudin Effendi Putra')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '81234567887652')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'avia3010@gmail.com')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'via3010@gmail.com')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.139.47/ui-onboarding/')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/span_Pilih produk lain_chakra-checkbox__con_f17e9e'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Belum Memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Akun GiroApakah Anda Sudah Memiliki Gir_4adac9'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Indira')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '0812345678876')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Kembali'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih Bentuk Badan UsahaPTInstansi P_631b71'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nama Perusahaan_onboardDto.compName'), 'pt')

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih BidangSektor UsahaAIRBEARER CO_896bdf'), 
    '19', true)

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tempat Usaha Berdiri_onboardDto.businessEst'), 
    'bekasi')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Usaha Berdiri_onboardDto.busi_5a7ca8'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Usaha Berdiri_onboardDto.busi_5a7ca8'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_16'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Jumlah Karyawan_onboardDto.employeeCount'), 
    '1000')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Indonesia'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Tidak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Penghasilan Pertahun_onboardDto.annualIncome'), 
    '999999999')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Jumlah Pelanggan_onboardDto.customerCount'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Persentase Pelanggan Domestik_onboard_21796c'), 
    '85')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Bentuk Badan UsahaPilih Bentuk Badan Us_552973'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih NegaraIndonesia'), '1', true)

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Pilih ProvinsiPilih ProvinsiKalimantan _014e5b'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih ProvinsiKalimantan SelatanKali_d34dfd'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '298', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih KecamatanJohar BaruSawah Besar_704bf6'), 
    '1612', true)

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/label_Kode Pos'))

WebUI.selectOptionByValue(findTestObject('Object Repository/tc001/Page_Onboarding/select_Pilih KelurahanBungurKenariKramatKwi_7e0e84'), 
    '92353', true)

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_J'), 'J')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl'), 'Jl')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl_1'), 'Jl.')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl_1_2'), 'Jl. ')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. K'), 'Jl. K')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Ke'), 'Jl. Ke')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Ken'), 'Jl. Ken')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kena'), 'Jl. Kena')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenar'), 'Jl. Kenar')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari'), 'Jl. Kenari')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari_1'), 'Jl. Kenari ')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari I'), 'Jl. Kenari I')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari II'), 'Jl. Kenari II')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III'), 'Jl. Kenari III')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III_1'), 'Jl. Kenari III ')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III N'), 'Jl. Kenari III N')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III No'), 'Jl. Kenari III No')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III No_1'), 'Jl. Kenari III No ')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/textarea_Jl. Kenari III No 7'), 'Jl. Kenari III No 7')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '08123456789')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'sylvia@ekreasi.com')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'www.sinargemilang.com')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_NPWP_onboardPermitsDto.npwp'), '334567899876545678')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/label_Tempat Dikeluarkan Identitas'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_NPWP_onboardPermitsDto.npwp'), '3345678998765456')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), 
    '5678998765456789')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_2829301234'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_29'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'), 
    '5678987656789')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_15'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tempat Akte Dibuat_onboardPermitsDto._2e8135'), 
    'Bekasi')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Akte Perubahan_onboardPermitsDt_da252c'), 
    '5678987656789')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nama Notaris_onboardPermitsDto.notaryName'), 
    'Sena')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_a78d82'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_30'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Notaris_onboardPermitsDto.notaris'), 'Seno')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '4567890987656789')

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_Tanggal PembuatanPrevious MonthMay 2024_3fd24c'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_28'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_29'))

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/div_29'))

WebUI.setText(findTestObject('Object Repository/tc001/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '4567890987656')

WebUI.click(findTestObject('Object Repository/tc001/Page_Onboarding/button_Selanjutnya'))

