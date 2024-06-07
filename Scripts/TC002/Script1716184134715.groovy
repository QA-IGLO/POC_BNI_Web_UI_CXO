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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Produk yang Anda pilihBNI Cash Manageme_ccefc4'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Pilih produk lain_chakra-checkbox__con_f17e9e'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Belum Memiliki Giro'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih Tujuan Pembukaan RekeningInves_a44001'), 
    'Investasi', true)

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Giro Rupiah'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_ADART'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama Orang Yang Berwenang_onboardDto._e0a54b'), 
    'Amrudin Effendi Putra')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Handphone_onboardDto.authPersonPhone'), 
    '081234567890')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Email Personal_onboardDto.authPersonEmail'), 
    'sylvia@ekreasi.com')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih Bentuk Badan UsahaPTBankKopera_6d3d37'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama Perusahaan_onboardDto.compName'), 
    'SINAR CAHAYA GEMILANG')

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih BidangSektor UsahaAIRBEARER CO_896bdf'), 
    '0107', true)

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tempat Usaha Berdiri_onboardDto.businessEst'), 
    'BEKASI')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama Perusahaan_onboardDto.compName'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Usaha Berdiri_onboardDto.busi_5a7ca8'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama Perusahaan_onboardDto.compName'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_13'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Jumlah Karyawan_onboardDto.employeeCount'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Indonesia'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Tidak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih Kelolaan Dana Pertahun Rp100 j_ced9d8'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Penghasilan Pertahun_onboardDto.annualIncome'), 
    '999999998')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Jumlah Pelanggan_onboardDto.customerCount'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Persentase Pelanggan Domestik_onboard_21796c'), 
    '85')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Bentuk Badan UsahaPilih Bentuk Badan Us_7525c2'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih NegaraIndonesia'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih ProvinsiKalimantan SelatanKali_d34dfd'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih KotaKepulauan SeribuJakarta Pu_905aab'), 
    '298', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih KecamatanJohar BaruSawah Besar_704bf6'), 
    '864', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/select_Pilih KelurahanGalurJohar BaruKampun_5763d2'), 
    '92331', true)

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_J'), 'J')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL'), 'JL')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL_1'), 'JL ')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL K'), 'JL K')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KE'), 'JL KE')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KEC'), 'JL KEC')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECA'), 'JL KECA')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAM'), 'JL KECAM')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMA'), 'JL KECAMA')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMAT'), 'JL KECAMAT')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATA'), 'JL KECAMATA')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN'), 'JL KECAMATAN')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN_1'), 'JL KECAMATAN ')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN I'), 'JL KECAMATAN I')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN II'), 'JL KECAMATAN II')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III'), 'JL KECAMATAN III')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III_1'), 'JL KECAMATAN III ')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III N'), 'JL KECAMATAN III N')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III NO'), 'JL KECAMATAN III NO')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III NO_1'), 'JL KECAMATAN III NO ')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/textarea_JL KECAMATAN III NO 4'), 'JL KECAMATAN III NO 4')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Telepon Perusahaan_onboardDto.c_a1aa7a'), 
    '08123456789')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Alamat Email Perusahaan'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Alamat Email Perusahaan_onboardDto.compEmail'), 
    'SYLVIA@EKREASI.COM')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Alamat Website Perusahaan_onboardDto._a617cb'), 
    'WWW.SINARCAHAYAGEMILANG')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_NPWP_onboardPermitsDto.npwp'), '34567899876545678')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_NPWP_onboardPermitsDto.npwp'), '3456789987654567')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tempat Dikeluarkan Identitas_onboardP_54807e'), 
    'BEKASI')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Akte Pengesahan_onboardPermitsD_8b3cf4'), 
    '345678998765678')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pengesahan_onboardPermitsDto._add01d'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_16'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Akte PendirianAnggaran Dasar_on_3c9837'), 
    '345678998765678')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pendirian_onboardPermitsDto.f_4006f0'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_12'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama Notaris_onboardPermitsDto.notaryName'), 
    'SENA')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tempat Akte Dibuat_onboardPermitsDto._2e8135'), 
    'BEKASI')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Akte Perubahan_onboardPermitsDt_3d2154'), 
    '345678987656789')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_7fe17e'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Perubahan_onboardPermitsDto.a_7fe17e'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_17181920212223'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_19'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Notaris_onboardPermitsDto.notary'), 'SENO')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Nomor Izin Usaha  NIBNomor Ijin Usaha h_bd0fa5'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '13')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'), 
    '')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Pembuatan_onboardPermitsDto.l_ecb58c'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_May 2024'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Previous Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Previous Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Su'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_19'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Sa'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Sa'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Notaris_onboardPermitsDto.notary'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Tanggal Expired'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Tanggal Expired_onboardPermitsDto.lic_eb8bef'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Next Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Next Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Next Month'))

WebUI.doubleClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Next Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Next Month'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_17'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Izin Usaha  NIB_onboardPermitsD_df6ad9'), 
    '1334567899876')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/p_Format PDF max. 1Mb'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Klik untuk upload'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/label_Klik untuk upload atau drag and dropF_848054'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_408759'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Surat Keterangan Domisili_css-3ff64v'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Klik untuk upload atau drag and dropFor_c29bdb'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Inquiry'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Tidak'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_User ID_usersDto.makerDto.0.userId'), 
    'IDAW678')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_User ID_usersDto.makerDto.0.userId'))

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Selanjutnya_onboardDto.corpId'), 'IDAW213')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nama User_usersDto.makerDto.0.userName'), 
    'IDA WASEDA')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Nomor Handphone_usersDto.makerDto.0.p_729376'), 
    '0834567890987')

WebUI.setText(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Alamat Email_usersDto.makerDto.0.email'), 
    'IDA.WASEDA@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_JELAMBAR BARU - JL. JELAMBAR BARU RAYA _00a004'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Pilih Jadwal Kunjungan_onboardDto.visitDate'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_22'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/span_Syarat dan Ketentuan_chakra-checkbox___de1f61_1'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selesai  Kirim'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/p_Kembali'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Pilih Cabang PendaftaranPilih Cabang Tu_6deb16'))

WebUI.rightClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.rightClick(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/div_Data Cabang tidak tersedia_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/Rec_20052024/Page_Onboarding/input_Pilih Jadwal Kunjungan_onboardDto.visitDate'))

